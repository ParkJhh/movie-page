<template>

    <main>
        <div>
            <h1>Community</h1> 
        </div>
        <div id="communityTable">
            <table >
                <thead>
                <tr>
                <td>No.</td>
                <td>제목</td>
                <td>작성자</td>
                <td>조회수</td>
                <td>작성일</td>
                <td>수정일</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                <td>1</td>
                <td>테스트</td>
                <td>테스트</td>
                <td>확인용</td>
                <td>눈으로</td>
                <td>봅니다</td>
                </tr>
                <tr>
                <td>2</td>
                <td>테스트</td>
                <td>테스트</td>
                <td>확인용</td>
                <td>눈으로</td>
                <td>봅니다</td>
                </tr>
                </tbody>
            </table>
        </div>
        
    </main>
</template>

<script>

</script>

<style scoped>
#communityTable{
    text-align: center;
    justify-content: center;
    display: flex;
}

thead {
    color: white;
}

table tbody tr {
  background-color: white !important;
}
</style>