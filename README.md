# Lowest Common Ancestor of a Binary Tree (Java Starter Kit)

This Java project solves the **Lowest Common Ancestor (LCA)** problem for a binary tree using command-line input. It's structured to build and run via **Apache Ant**, producing a runnable `.jar` file.

---

## 🧩 Problem Statement

Given a binary tree and two nodes `p` and `q`, find their **lowest common ancestor** (LCA).  
The binary tree is provided in **level-order traversal** format.

> According to the definition of LCA:
> “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

---

## ✅ Example

Input:

```bash
java -jar dist/lib/dist.jar "[3,5,1,6,2,0,8,null,null,7,4]" 5 4
```

## ⚙️ How to Build and Run

```bash
ant clean dist
java -jar dist/lib/dist.jar "[3,5,1,6,2,0,8,null,null,7,4]" 5 4