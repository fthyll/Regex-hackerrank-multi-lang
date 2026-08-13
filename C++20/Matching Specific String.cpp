#include <iostream>
#include <regex>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    getline(cin, s);

    regex pattern("hackerrank");
    auto begin = sregex_iterator(s.begin(), s.end(), pattern);
    auto end = sregex_iterator();
    int count = distance(begin, end);
    cout << "Number of matches : " << count;

    return 0;
}