import movie from "./movie";

export default {
  install : (app) => {
    app.config.globalProperties.$movie = movie;
}
}