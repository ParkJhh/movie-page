import axios from 'axios';

const API_URL = 'https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page='

export default {
    async mainLoad(num){
        let res = await axios.get(`${API_URL}${num}`);
        return res.data.results
    },
    //커뮤니티 삭제
    async deleteCommunity(){
        await axios.delete(`/api/community/${id}`);
    },
    //커뮤니티 상세 조회
    async detailCommunity(){
        await axios.get(`/api/community/${id}`);
    },
    //커뮤니티 목록 조회
    async listCommunity(page){
        let res = await axios.get(`/api/community/list/${page}`);
        return res.data;
    },
    //커뮤니티 전체 개수
    async allCountCommunity(){
       let res = await axios.get(`/api/community/countAll`)
       return res.data;
    },
    //커뮤니티 등록
    async addCommunity(){
        await axios.post(`/api/community/`);
    },
    //커뮤니티 수정
    async updateCommunity(){
        await axios.put(`/api/community/${id}`);
    },

    //로그인
    async login(loginId, password){
        return await axios.post(`/api/login/chk` ,{
            loginId: loginId,
            password: password,
        });
    },
    async idCheck(inputId){
        return axios
            .post(`/api/login/idChk`, {
                loginId: inputId,
        })
    },
    //비밀번호 변경
    async changePassword(){
        await axios.post(`/api/login/pwChange`);
    },

    //회원 탈퇴
    async deleteMember(){
        await axios.delete(`/api/member/`);
    },
    //회원 가입
    async addMember(form){
        try {
            await axios.post(`/api/member/`, form);
            return true;
          } catch (error) {
            console.error("에러발생", error);
            return false;
          }
    },
    //회원 수정
    async updateMember(){
        await axios.put(`/api/member/`);
    },
    //회원 사진 변경
    async PutProfile(){
        await axios.put(`/api/member/profile`);
    },
}