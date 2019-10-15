#include <iostream>
using namespace std;
int main() {
  int hours;
  double pay,gross,tax,net;
  cout<<"Enter hours: ";
  cin>>hours;
  cout<<"Enter price per hour: ";
  cin>>pay;

  if(hours<=40)
    gross=hours * pay;
  else{
    gross=40 * pay;
    gross=gross+(hours-40)*pay*1.5;
  }
  tax=gross*0.2;
  net=gross-tax;
  cout<<"Gross pay: "<<gross<<endl;
  cout<<"Tax : "<<tax<<endl;
  cout<<"Net pay: "<<net<<endl;

}