<template>
    <footer id="footer">
    <div class="inner">
      <h2>Movie Page</h2>
      <ul>
        <li>
          <a href="#">(000) 000-0000</a>
        </li>
        <li>
          <a href="#">information@untitled.tld</a>
        </li>
        <li>
          123 Somewhere Road,
          Nashville, TN 00000
        </li>
      </ul>
    </div>
  </footer>
  <div class="copyright">
    Powered by: <a href="https://templated.co/">TEMPLATED</a>.
  </div>
</template>

<style scoped>
#footer {
    bottom: 3%;
    width: 100%;
    font-size: 12px;
    padding: 6em 0 4em 0;
    background: #ffeeee;
    text-align: center;
    color: #747474;
}

#footer > h2 {
    color: #6d6d6d;
}

#footer li {
    margin-left: 25px;
    display: inline;
}

#footer a {
    color: #747474;
    text-decoration: none;
}


#footer > ul > li {
    padding: 0 2em;
}

#footer > .copyright {
    display: inline-block;
    color: #ffffff;
    font-size: 0.75em;
    margin: 0 0 2em 0;
    padding: 0;
    text-align: center;
    border-top: 1px solid rgba(255, 255, 255, 0.25);
    padding: 2em 10em;
}

.copyright {
   background: aliceblue;
   display: inline-block;
   color: black;
   font-size: 0.75em;
   text-align: center;
   border-top: 1px solid rgba(255, 255, 255, 0.25);
   padding: 2em 0 2em 0;
   width: 100%;
}

.copyright >  a{
   color: black;
   text-decoration: none;
   font-weight: 700;
}

</style>