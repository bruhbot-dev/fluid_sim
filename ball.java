
public class ball{
    private float _size;
    private _PVector _location;

    void collisionDetection() {
        
    }

    void move(PVector velocity, float colliderSize) {
        _location.add(velocity);
        if (checkBounce(_location.x, colliderSize)) {
          velocity.x = velocity.x * -1;
        }
          
        if (checkBounce(_location.y, colliderSize)) {
          velocity.y = velocity.y * -1;
        }
        
        if (checkBounce(_location.z, colliderSize)) {
          velocity.z = velocity.z * -1;
        }
      }
}