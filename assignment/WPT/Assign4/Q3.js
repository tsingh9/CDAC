    function fetchData(url, callback){
   setTimeout(()=>{
    callback("Successful")
   },2000)

    }

    fetchData("https://www.google.com/", (str)=>{
        console.log(str);
    })