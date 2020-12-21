#include <iostream>
#include <bits/stdc++.h>
#include <algorithm>

#define ll long long
#define pb push_back
using namespace std;

int main() {

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  int t;
  cin >> t;
  while(t--){
    int x, y, k, n;
    cin >> x >> y >> k >> n;
    if(abs(x-y)%(2*k)==0) cout << "Yes\n";
    else cout << "No\n";
  }
  return 0;
}
