public class Shapes {
    int area;
    int perimeter;
    int sides;
    public class Circles extends Shapes{

    }
    public class Rectangles extends Shapes{
        public class Squares extends Rectangles{

        }
    }
    public class Triangles extends Shapes{
        public class Isoceles extends Triangles{

        }
        public class Equilateral extends Triangles{

        }
        public class Scalene extends Triangles{

        }
    }
    
}
