
/*
 * Create the function factorial here
 */
function factorial(n) {
    let result = 1;
    for(var i=2; i<=n; i++) {
        result = result * i;        
    }
    return result;
}
