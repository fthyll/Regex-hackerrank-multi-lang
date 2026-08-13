#include <iostream>
#include <regex>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    getline(cin, s);

    regex pattern("\\S+\\s\\S+\\s\\S+");
    if (regex_search(s, pattern))
        cout << "True";
    else
        cout << "False";

    return 0;
}