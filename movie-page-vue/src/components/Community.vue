<template>

    <main>
        <div id="pageHead">
            <h1>Community</h1> 
        </div>
        <div id="communityTable" class="border border-dark-subtle">
            <table class="table table-hover">
                <thead class="table-dark">
                <tr>
                <td>No.</td>
                <td>제목</td>
                <td>작성자</td>
                <td>조회수</td>
                <td>작성일</td>
                <td>수정일</td>
                </tr>
                </thead>
                <tbody class="table-group-divider">
                  <tr v-for="(item, index) in communityData" :key="index">
                    <td>{{ item.id }}</td>
                    <td>{{ item.title }}</td>
                    <td>{{ item.username }}</td>
                    <td>{{ item.viewCount }}</td>
                    <td>{{ item.createdAt }}</td>
                    <td>{{ item.updatedAt }}</td>
                  </tr>
                </tbody>
            </table>
        </div>
        
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
    </main>
</template>

<script>
export default {
    data() {
        return {
          communityData : [{
            id: 0,
            title: "",
            note: "",
            username: "",
            createdAt: "",
            updatedAt: "",
            viewCount: 0,
        }],
        currentPage: 1,
        startPageOnScreen: 1,
        pagenationNum: 0,
        //커뮤니티는 한 화면에 10개씩
        maxPageOnScreen: 10,
        allCommunityCount: 0,
      }
    },

    async mounted() {
        this.communityData = await this.$movie.listCommunity(1);
        console.log(this.communityData)
        this.allCommunityCount = await this.$movie.allCountCommunity();
        console.log(this.allCommunityCount)
    },

    methods : {
      hasPrevPage(currentPage) {
        if(currentPage < 11) {
          return false;
        } else {
          return true;
        }
      },
      hasNextPage(currentPage) { 
        if(currentPage + this.pagenationNum > this.allCommunityCount) {
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
        this.currentPage = page
        this.communityData = await this.$movie.listCommunity(page);
        return this.communityData;
      }
    }
}



</script>

<style scoped>

#pageHead {
  margin: 1%;
}

#communityTable{
    text-align: center;
    justify-content: center;
    display: flex;
    margin-bottom: 1%;
}

thead {
    color: white;
}

table tbody tr {
  background-color: white !important;
}

</style>