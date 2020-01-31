// Run the below code with the command "jjs -scripting embedded-msg.js" to pass the embedded dynamic value
var hello = function(msg){  
    print("Hello "+msg);  
};  
hello("Nashron");

function sum(a, b) {
  print("a :"+a+" b :"+b);
  return (a + b);
}