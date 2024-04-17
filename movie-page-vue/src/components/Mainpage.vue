<template>
  <main id="main">
    <div class="movie">
        <img class="movie img" src="" alt="이미지표시">
        <div class="movie-info">
        <h3>영화제목</h3>
            <span>평점 3.5</span>
        </div>
        <div class="overview">
            <h3>Overview</h3>
        </div>
    </div>
  </main>
</template>
  
<script>
  export default {
    name: 'HelloWorld',
    props: {
      msg: String
    }
  }
</script>
  
<style scoped>
  main {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
  }
</style>