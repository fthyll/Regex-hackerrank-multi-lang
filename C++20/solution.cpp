#include <iostream>
#include <regex>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    getline(cin, s);

    regex pattern("...");
    if (regex_match(s, pattern))
        cout << "True";
    else
        cout << "False";

    return 0;
}