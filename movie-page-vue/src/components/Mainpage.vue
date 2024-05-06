<template>
  <main id="main">
    <div class="movie" v-for="i in movieData" >
      <img class="movie img" :src="`${i.poster_path}`" alt="이미지표시">
      <div class="movie-info">
        <h3> {{ i.title }}</h3>
        <span :class="colorFind(i.vote_average)"> {{ i.vote_average }}</span>
      </div>
      <div class="overview">
      <h3> {{ i.overview }}</h3>
      </div>
    </div>
  </main>
  <nav aria-label="Page navigation example"> 
    <ul class="pagination justify-content-center" id="pagination">
      <li :class="hasPrevPage(currentPage) ? 'page-item' : 'page-item disabled'">
        <a class="page-link" @click="moveToPrevPage">Previous</a>
      </li>
      <li v-for="page in maxPageOnScreen" :key="page + pagenationNum" :class="{'page-item': true, 'active': page + pagenationNum === currentPage}">
        <a class="page-link" @click="pageMove(page + pagenationNum)">{{ page + pagenationNum }}</a>
      </li>
      <li :class="hasNextPage(currentPage) ? 'page-item' : 'page-item disabled'">
        <a class="page-link" @click="moveToNextPage">Next</a>
      </li>
    </ul>
  </nav>
</template>
  
<script>
  export default {
    data() {
      return {
          movieData : [{
          adult : false,
          original_language : "",
          overview : "",
          poster_path : "",
          release_date: "",
          title : "",
          vote_average: 0,
          vote_count : 0
        }],
        currentPage: 1,
        startPageOnScreen: 1,
        pagenationNum: 0,
        maxPageOnScreen: 10,
      }
    },
    
    async mounted() {
      const IMG_PATH = 'https://image.tmdb.org/t/p/w1280';
      this.movieData = await this.$movie.mainLoad(1);
      for(let i =0; i < this.movieData.length; i++){
        this.movieData[i].poster_path = `${IMG_PATH}${this.movieData[i].poster_path}`
        this.movieData[i].vote_average = this.movieData[i].vote_average.toFixed(1)
      }
    },
    methods : {
      colorFind(voteA){
        if(voteA >= 7.5){
          return 'green'
        } else if(voteA >= 6.0 && voteA < 7.5){
          return 'orange'
        } else if(voteA < 6.0) {
          return 'red'
        }
      },
      hasPrevPage(currentPage) {
        if(currentPage < 11) {
          return false;
        } else {
          return true;
        }
      },
      hasNextPage(currentPage) { 
        if(currentPage + this.pagenationNum > 30) {
          return false;
        } else {
          return true;
        }
      },
      moveToPrevPage(){
        if(this.currentPage > 10){
          this.currentPage = this.currentPage - 10;
          this.pagenationNum -= 10;
          this.pageMove(this.currentPage)
        }
      },
      moveToNextPage(){
        if(this.currentPage < 30){
          this.currentPage = this.currentPage + 10;
          this.pagenationNum += 10;
          this.pageMove(this.currentPage)
        } 
      },
      async pageMove(page){
        const IMG_PATH = 'https://image.tmdb.org/t/p/w1280';
        this.currentPage = page
        this.movieData = await this.$movie.mainLoad(page);
        for(let i =0; i < this.movieData.length; i++){
          this.movieData[i].poster_path = `${IMG_PATH}${this.movieData[i].poster_path}`
          this.movieData[i].vote_average = this.movieData[i].vote_average.toFixed(1)
        }
        return this.movieData
      }
    }
  }

</script>
  
<style scoped>
  main {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
  }
  .movie {
  width: 300px;
  margin: 1rem;
  background-color: var(--secondary-color);
  box-shadow: 0 4px 5px rgba(0, 0, 0, 0.2);
  position: relative;
  overflow: hidden;
  border-radius: 3px;
}

.movie img {
  width: 100%;
}

.movie-info {
  color: #eee;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap:0.2rem;
  padding: 0.5rem 1rem 1rem;
  letter-spacing: 0.5px;
}

.movie-info h3 {
  margin-top: 0;
}

.movie-info span {
  background-color: var(--primary-color);
  padding: 0.25rem 0.5rem;
  border-radius: 3px;
  font-weight: bold;
}

.movie-info span.green {
  color: lightgreen;
}

.movie-info span.orange {
  color: orange;
}

.movie-info span.red {
  color: red;
}

.overview {
  background-color: #fff;
  padding: 2rem;
  position: absolute;
  left: 0;
  bottom: 0;
  right: 0;
  max-height: 100%;
  transform: translateY(101%);
  overflow-y: auto;
  transition: transform 0.3s ease-in;
}

.movie:hover .overview {
  transform: translateY(0);
}
</style>