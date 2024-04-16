<template>
    <header id="header">
        <nav class="navbar navbar-expand-lg">
          <ul id="links">
            <li><a @click="$router.push('/')"> MainPage </a></li>
            <li><a @click="$router.push('/login')"> Login </a></li>
            <li><a @click="$router.push('/signup')"> Sign up </a></li>
            <li><a @click="$router.push('/community')"> Community </a></li>
          </ul>
        </nav>
        <form id="form">
            <input type="text" id="search" class="search" placeholder="Search">
        </form>
    </header>
</template>

<style scoped>
header {
  padding: 1rem;
  display: flex;
  justify-content: flex-end;
  background-color: var(--secondary-color);
}

/*헤더 태그 css*/
header > nav {
    justify-content: start;
    float: right;
    font-weight: bold;
    text-decoration: none;
    margin-right: 20px;
    text-align: left;
}

#links > li {
  display: inline;
}

header > nav > ul > li > a {
    display: inline-block;
    line-height: 60px;
    padding: 0 30px;
    color: white;
}

header > nav > a:hover {
    color: #7378c5;
}


.search {
  background-color: transparent;
  border: 2px solid var(--primary-color);
  border-radius: 50px;
  font-family: inherit;
  font-size: 1rem;
  padding: 0.5rem 1rem;
  color: #fff;
  margin: 25px;
}

.search::placeholder {
  color: #7378c5;
}

.search:focus {
  outline: none;
  background-color: var(--primary-color);
}
</style>