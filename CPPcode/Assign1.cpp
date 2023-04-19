#include<iostream>
#include<stdio.h>
#include <string>
using namespace std;

class A {
    // A 
    public:
    A()
    {
        cout <<"I am constructor of A"<< endl;
    }
~A(){
cout<< "Distructor of A \n";
}
};

class B : public A {
    //B
    public:
       B():A() {
        cout <<"I am constructor of B"<< endl;
       }
~B(){
cout<< "Distructor of B \n";
}   
 };

 class C : public A {
    //C
    public:
       C():A() {
        cout <<"I am constructor of C"<< endl;
       }
~C(){
cout<< "Distructor of C \n";
}   
 };

class D: public B{
    public:
        D():B() {
        cout <<"I am constructor of D"<< endl;
    }
~D(){
cout<< "Distructor of D \n";
} 
};

class E: public B{
    public:
        E():B() {
        cout <<"I am constructor of E"<< endl;
   }
~E(){
cout<< "Distructor of E \n";
} 
};

class F: public C {
    public:
        F():C() {
        cout <<"I am constructor of F"<< endl;
   }
~F(){
cout<< "Distructor of F \n";
}   
 };

class G: public C {
    public:
        G():C() {
        cout <<"I am constructor of G"<< endl;
        }
~G(){
cout<< "Distructor of G \n";
}      
};

class H: public D, public E {
    public:
        H():D(), E() {
        cout <<"I am constructor of H"<< endl;
        }
~H(){
cout<< "Distructor of H \n";
}       
};

class I: public F, public G {
    public:
        I():F(), G() {
        cout <<"I am constructor of I"<< endl;
        }
~I(){
cout<< "Distructor of I \n";
}      
};

class J: public H, public I {
    public:
        J():H(), I() {
        cout <<"I am constructor of J"<< endl;
        }
~J(){
cout<< "Distructor of J \n";
}      
};
 


int main(int argc, char const *argv[])
{
    // A a;
    // B b;
    //C c;
    //D d;
    //E e;
    //F f;
    //G g;
   //  H h;
  // I i;
  J j;


    return 0;
}
