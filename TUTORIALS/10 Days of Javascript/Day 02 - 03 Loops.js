/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    let cons = [];
    for(var i =0; i < s.length; i++) {
        switch(s[i]) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                console.log(s[i]);
                break;
            default:
                cons.push(s[i]);
                break;
        }
    }
    for(var i =0; i<cons.length; i++)
        console.log(cons[i])
}
