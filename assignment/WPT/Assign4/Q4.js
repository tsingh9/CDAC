const fetchData=(url,call)=>{
    setTimeout(()=>{
       const isSuccess=1;

       if(isSuccess){
        call(null,"hello");
       }
       else{
        const error="fail";
        call(error,null);
       }

    },2000);
}
fetchData("https://www.google.com/",(error, response) => {
    if (error) {
        console.error("Error:", error); // Log the error
    } else {
        console.log("Response received:", response); // Log the successful response
    }});