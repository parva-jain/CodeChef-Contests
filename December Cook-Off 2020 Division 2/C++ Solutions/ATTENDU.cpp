#include <iostream>
#include <bits/stdc++.h>
#include <algorithm>
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  int t;
  cin >> t;
  while(t--){
    float n;
    cin >> n;
    string s;
    cin >> s;
    float present=0;
    float absent=0;
    for(int i=0; i<s.size(); i++){
      if(s[i]=='0') absent++;
      else present++;
    }
    float ans = (120-absent)/(120);
    if(ans>=0.75) cout << "YES\n";
    else cout << "NO\n";
  }
  return 0;
}
