#include <iostream>
#include <iomanip>

using namespace std;

int main(){
    
    int debit;
    double total;

    cout << std::fixed;
    cout << std::setprecision(2);

    cin >> debit >> total;

    if(debit % 5 == 0){

        double finalBal = total - debit - 0.5;
        if(finalBal >= 0){
            
            cout << finalBal;
        }else{
            cout << total;
        }
    }else{
        cout << total;
    }

    return 0;
}