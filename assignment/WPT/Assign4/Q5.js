function fetchData(url,callback){
    setTimeout(()=>{const response={status:200,url};
   callback(response);
   
   
},2000);
     
}

function processData(a){

    const x=a();
    console.log(x);
}
fetchData("https://www.google.com/",(r)=>{
console.log("received");
processData(()=>{
      return r;
    });
   
});