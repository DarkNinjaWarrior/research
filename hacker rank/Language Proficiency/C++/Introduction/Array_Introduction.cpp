#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int l;
    cin >> l;
    int a[l];
    for (int i=0; i<l; i++) {cin >> a[i];}
    for (int i=l-1; i>=0; i--) {cout << a[i] << " ";}
    return 0;
}
