/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try{
        let strs = s.split('');
        strs = strs.reverse();
        console.log(strs.join(''));
    }catch(e){
        console.log(e.message);
        console.log(s);
    }finally{
        
    }
}
