#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n, q;
    cin >> n >> q;
    vector<int> a[n];
    for (int i=0; i<n; i++){
        int k;
        cin >> k;
        for (auto j=0;j<k; j++) {
            int input;
            cin >> input;
            a[i].push_back(input);
        }
    } 
    for (int c=0;c<q;c++){
        int i,j;
        cin >> i >> j;
        int *arr = a[i].data();
        cout << arr[j] << endl;
    }
    return 0;
}

