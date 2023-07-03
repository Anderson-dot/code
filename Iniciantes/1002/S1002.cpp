#include <stdio.h>

int main() {
    double N = 3.14159, raio;
    scanf("%lf", &raio);

    double area = (raio * raio) * N;
    printf("A=%.4lf\n", area);
    return 0;
}
