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
    string s;
    cin >> s;
    if(s.size()%2!=0) cout << -1 << "\n";
    else{
      int zero=0;
      int one=0;
      for(int i=0; i<s.size(); i++){
        if(s[i]=='0') zero++;
        else one++;
      }
      if(zero == one) cout << 0 << "\n";
      else if(zero == s.size() || one == s.size()) cout << -1 << "\n";
      else cout << abs((int)(s.size()/2)-zero) << "\n";
    }
  }
  return 0;
}
