/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    let first = 0;
    let second = 0;
    let len = nums.length;
    for(var i=0; i<len; i++){
        if(second < nums[i]){            
            if(first < nums[i]){
                second = first;
                first = nums[i];    
            } else if(first != nums[i])
                second = nums[i];
        }        
    }
    return second;
}
