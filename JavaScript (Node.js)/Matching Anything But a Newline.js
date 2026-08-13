const Regex_Pattern = /^.{3}\..{3}\..{3}\..{3}$/;
function processData(test_string) {
    return Regex_Pattern.test(test_string);
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
readline.on('line', (line) => {
    console.log(processData(line));
    readline.close();
});