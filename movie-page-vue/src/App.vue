<template>
  <Header/>
  <router-view/>
  <Footer/>
</template>

<script>
  import Header from "./components/public/Header.vue";
  import Footer from "./components/public/Footer.vue"
  
  export default {
    components: {
      Header,
      Footer
    }
  }

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

:root {
  --primary-color: #22254b;
  --secondary-color: #373b69;
}

body {
  background-color: var(--primary-color);
  font-family: 'Poppins', sans-serif;
  margin: 0;
}
</style>
