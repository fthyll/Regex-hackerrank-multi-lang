const Regex_Pattern = '...';
function processData(test_string: string): boolean {
    return new RegExp(`^${Regex_Pattern}$`).test(test_string);
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
readline.on('line', (line: string) => {
    console.log(processData(line));
    readline.close();
});