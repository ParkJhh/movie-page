<template>
    <div id="pageHead">
        <h1>SignUp Please</h1>
    </div>

    <div class="signForm">
      <form
        @submit.prevent
        class="d-flex flex-column gap-3 border border-5 p-5 rounded-4"
      >
        <div class="d-flex gap-3">
          <input class="rounded-3" @change="loginIdCheck = false" type="text" v-model="form.loginId" placeholder="사용할 아이디" />
          <button
            @click="checkLoginId"
            data-bs-toggle="modal"
            data-bs-target="#ErrorModal"
            class="btn btn-secondary rounded-3"
            :disabled="loginIdCheck"
          >
            아이디중복체크
          </button>
        </div>

        <input class="rounded-3" type="text" v-model="form.name" placeholder="이름" />
        <input class="rounded-3" type="password" v-model="form.password" placeholder="비밀번호" />
        <input class="rounded-3" type="password" v-model="form.passwordCheck" placeholder="비밀번호 확인" />
        <input class="rounded-3" type="email" v-model="form.email" placeholder="Email" />
        <input class="rounded-3" type="text" v-model="form.phoneNumber" placeholder="핸드폰번호 ex)010-xxxx-xxxx"/>

        <div class="d-flex gap-3">
          <input class="rounded-3" type="text" v-model="form.zipcode" readonly id="zipcode" placeholder="우편번호" />
          <button class="btn btn-secondary rounded-3">
            주소 검색
          </button>
        </div>

        <div class="d-flex gap-3">
          <input class="rounded-3" type="text" v-model="form.address"  readonly id="address" placeholder="주소" />
        </div>

        <input class="rounded-3" type="text" v-model="form.address2" id="address2" placeholder="상세한 주소"/>

        <div class="d-flex flex-fill gap-3 justify-content-start" id="birth-gender">
          <div class="birth-gender">
            생년월일:
            <input class="rounded-3" type="date" v-model="form.birth" id="birthday" placeholder="생년월일" />
          </div>
          <div class="birth-gender">
            성별: 
            <input type="radio" v-model="form.gender" id="male" name="gender" value="0"/>
            <label for="male" id="gender" class="m-0">남성</label>
            <input type="radio" v-model="form.gender" id="female" name="gender" value="1"/>
            <label for="female" id="gender" class="m-0">여성</label>
          </div>
        </div>
      </form>
    </div>
      <button 
        @click="signUp"
        class="btn btn-secondary rounded-3"
        id="signButton"
        data-bs-toggle="modal"
        data-bs-target="#ErrorModal"
      >
        회원가입
      </button>
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
      modal: "",
      form: {
        loginId: "",
        name: "",
        password: "",
        passwordCheck: "",
        answer: "",
        email: "",
        phoneNumber: "",
        zipcode: "",
        address: "",
        address2: "",
        birth: "",
        gender: 0,
      },
      loginIdCheck: false,
    }
  },
  methods: {
    async checkLoginId() {
      if(this.form.loginId == null){
          this.modal ="id"
      } else {
        const res = await this.$movie.idCheck(this.form.loginId);
        if (res) {
          this.modal = "idCheckOk";
          this.loginIdCheck = true;
        } else {
          this.modal = "idCheckFail";
          this.form.loginId = "";
        }
      }
    },
    async signUp(){
      if (!this.loginIdCheck) {
        this.modal = "idFail";
        return;
      }
      
      const res = await this.$movie.addMember(this.form);
      if (res) {
        this.modal = "signUpOk";
      } else {
        this.modal = "signUpFail";
      }
    }
  },
}

</script>

<style scoped>

#pageHead {
  margin: 1%;
}

.signForm {
  flex-wrap: wrap;
  justify-content: center;
  margin-left: 25%;
  margin-right: 25%;
  margin-bottom: 1%;
}

#signButton {
  margin-bottom: 1%
}
</style>