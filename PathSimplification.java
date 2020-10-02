import java.util.*;

class PathSimplification {

    /*
     * simplifyPath assumes a valid absolute path is sent
     * as input for conversion. 
     */ 
    public static String simplifyPath(String path) {

        if (path == null || path.contentEquals(""))
            return path;
        // In Unix-like more than one '/' is same as a single '/' 
        path = path.replaceAll("[/]{1,}", "/");

        if (path.charAt(0) == '/')
            path = path.substring(1);
        
        String[] directories = path.split("/");
        // using ArrayDeque as a stack. AaaS :)
        Deque<String> pathStack = new ArrayDeque<>();
        pathStack.addLast("/");

        for (String s : directories) {
            
            //no action required for . (current directory)
            if (".".contentEquals(s)) {
                continue;
            } else if ("..".contentEquals(s)) {
                // In Unix-like after reaching '/', '..' means nothing
                if ("/".contentEquals(pathStack.peekLast())) {
                    continue;
                }
                pathStack.removeLast();
            } else {
                pathStack.addLast(s);
            }
        }

        // TODO simplify this string building mess
        StringBuilder sb = new StringBuilder();
        while (!pathStack.isEmpty()) {
            if (!("/".contentEquals(pathStack.peekLast()))) {
                sb.insert(0, pathStack.peekLast());
                sb.insert(0, "/");
            }
            pathStack.removeLast();
        }
        if (sb.length() < 1) {
            sb.insert(0, "/");
        }
        return new String(sb);
    }

    public static void main(String args[]) {
        String s = ".././sd/./hell/./..";
        System.out.println(simplifyPath(s.trim()));
    }
}