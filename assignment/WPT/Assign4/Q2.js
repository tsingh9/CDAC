const a=[1,2,3,4,5]
    forEachElement(a,(a)=>{for(i=0;i<a.length;i++){
        console.log(a[i]*2);
    }});

   function forEachElement(a,callback){
    callback(a)

   }
