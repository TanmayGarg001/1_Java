package com.company;

//Hashing concept is not done in the TreeMap.
//Before that learn the tree data structure, and know about different types of trees.
//https://towardsdatascience.com/8-useful-tree-data-structures-worth-knowing-8532c7231e8c
//https://www.educative.io/blog/data-structures-trees-java

//video:- https://www.youtube.com/watch?v=QhIM-G7FAow
//in order to fully understand trees get to know about recursion.

public class Main {
    //Trees are used for hieratical data
    //It is a collection of entities called nodes linked together to simulate a hierarchy. It is a non-linear data structure.
    //See the images along with the comments.

    public static void main(String[] args) {

        //ROOT:- Topmost node is called the root of the tree and may contain link/reference to other nodes, that are called its children.It has no parent.
        //CHILDREN&PARENT&SIBLING:- When a node has links to further nodes, the nodes that are below that node are children node. The children node under the same parent are
        //called sibling among themselves.
        //LEAF:- An empty node i.e. a node that has no further children is called leaf node.
        //We have many relations like grandparent/cousin/grandchild etc. Also tree is uni directional that is link is uni-directional, we can walk in only direction in tree.

        //N-ary Tree is a tree which is a general tree and has no limit on parents and children.

        //Depth of a node is number of edges/links in path from root node to node X
        //Height of node X is number of edges/links in longest path from node X to leaf node.
        //Height of the tree is height of the root node.

        //Their are different types of trees that are used in different scenarios. Example :- BinaryTree,AVL tree,Red Black Tree etc.
        //Binary tree is most famous and widely used.(a tree in which a node can have at most 2 children).
        //In general trees are implemented using different approach compared to BinaryTree.

        //A strict binary tree is when each node has either 2 or 0 children.
        //A complete binary tree is when all the levels are filled up with max nodes exception being the last level but the the nodes in last level have to be as left as possible.
        //Cost of various operations in tree like :- searching, inserting, deleting etc. depends a lot on the height of the tree.
        //In binary search tree, in order to optimize the operations we try to make the tree as dense as possible as it will result in less height and less time :D
        System.out.print("-----");

    }
}