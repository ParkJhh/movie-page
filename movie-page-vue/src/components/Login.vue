<template>
    <div id="pageHead">
        <h1>Login Please</h1>
    </div>

    <div class="loginForm">
        <form @submit.prevent="login" class="d-flex flex-column border border-5 gap-4 rounded-4">
        <input id="userInput" class="rounded-3" v-model="loginId" type="text" placeholder="아이디" />
        <input id="userInput" class="rounded-3" v-model="password" type="password" placeholder="비밀번호" />

        <div class="d-flex justify-content-between flex-column-on-small-screen">
          <div id="userInput">
            <input
              type="checkbox"
              id="idsave"
              name="idsave"
            />
            <label for="idsave">아이디 저장</label>
          </div>

          <div id="userInput">
            <input
              type="checkbox"
              id="autologin"
              name="autologin"
            />
            <label for="autologin">자동 로그인</label>
          </div>
        </div>

        <div class="find">
          <a @click="$router.push('/find')"
            >아이디 / 비밀번호를 잊으셨다면?</a
          >
        </div>

        <div id="loginButton" class="d-flex justify-content-center">
          <button
            data-bs-toggle="modal"
            data-bs-target="#ErrorModal"
            class="btn btn-secondary"
          >
            로그인
          </button>
        </div>
      </form>
    </div>

    <div id="signPath">
      <h4>아직 회원이 아니시라면?</h4>
        <div class="d-flex justify-content-center">
          <a @click="$router.push('signup')" class="btn btn-outline-primary">회원가입</a >
        </div>
    </div>

    <!-- 로그인상태 모달 -->
  <ErrorModal :modal="modal" />
</template>

<script>
import ErrorModal from "@/components/modal/ErrorModal.vue"

export default {
  components: {
    ErrorModal,
  },

  data() {
    return {
      loginId: "",
      modal: "",
    };
  },

  methods: {
    async login() {
      this.modal = "login";

      if(this.password == null){
        this.modal = "passwordFail";
        return;
      }
      if (await this.$movie.login(this.loginId, this.password)) {
        location.href = "/";
      } else {
        this.modal = "loginFail";
      }
    }
  },
}
</script>

<style scoped>

#pageHead {
  margin: 1%;
}

.loginForm {
  flex-wrap: wrap;
  justify-content: center;
  margin-left: 25%;
  margin-right: 25%;
  margin-bottom: 1%;
}

#userInput {
  margin-top: 1%;
  margin-left: 10%;
  margin-right: 10%;
}

.find {
  color: #767d85;
}

#loginButton {
  margin-bottom: 1%;
}

#signPath {
  margin-bottom: 1%;
}
</style>