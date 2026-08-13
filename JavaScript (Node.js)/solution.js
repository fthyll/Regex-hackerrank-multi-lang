const Regex_Pattern = '...';
function processData(test_string) {
    return new RegExp(`^${Regex_Pattern}$`).test(test_string);
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
readline.on('line', (line) => {
    console.log(processData(line));
    readline.close();
});