const Regex_Pattern = /hackerrank/g;
function processData(test_string) {
    const matches = test_string.match(Regex_Pattern);
    return matches ? matches.length : 0;
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
readline.on('line', (line) => {
    console.log("Number of matches :", processData(line));
    readline.close();
});