export default {
    modalDatas: {
      "": {
        url: "",
        message: "",
        buttonMessage: "",
      },
      login: {
        url: "/",
        message: "아이디와 비밀번호 확인중...",
      },
      passwordFail: {
        url: "/login",
        message: "비밀번호를 입력해주세요.",
        buttonMessage: "확인",
      },
      loginFail:{
        url: "/login",
        message: "아이디 혹은 비밀번호를 확인해주세요.",
        buttonMessage: "확인",
      },
      idFail:{
        url: "/sign",
        message: "아이디를 확인해주세요",
        buttonMessage: "확인",
      },
      idCheckOk:{
        url: "/sign",
        message: "사용가능한 아이디입니다.",
        buttonMessage: "확인",
      },
      idCheckFail:{
        url: "/sign",
        message: "중복된 아이디입니다.",
        buttonMessage: "확인",
      },
      signUpOk: {
        url: "/",
        message: "회원가입이 완료되었습니다",
        buttonMessage: "이동",
      },
      singUpFail: {
        url: "/sign",
        message: "회원가입에 실패했습니다.",
        buttonMessage: "확인",
      },
    }
}