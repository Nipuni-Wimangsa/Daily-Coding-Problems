<h2> Daily Codoing Problem 3 [Medium - Google] </h2>

Given the root to a binary tree, implement <code>serialize(root)</code>, which serializes the tree into a string, and <code>deserialize(s)</code>
, which deserializes the string back into the tree.

For example, given the following Node class

<pre>
class Node:
    def __init__(self, val, left=None, right=None): 
        self.val = val        
        self.left = left        
        self.right = right
</pre>

The following test should pass:

<pre>node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'</pre>
