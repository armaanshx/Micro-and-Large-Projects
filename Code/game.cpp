#include <vector>
#include <iostream>

class GamePlatform 
{
public:
    static double calculateFinalSpeed(double initialSpeed, const std::vector<int>& inclinations) 
    {
        throw std::logic_error("Waiting to be implemented");
    }
};
#ifndef RunTests
int main()
{
    std::cout << GamePlatform::calculateFinalSpeed(60.0, { 0, 30, 0, -45, 0 });
    return 0;
}
#endif