### <ins> Task3 : Separated Graphs Counter

- This Java console application takes input that defines connections between vertices and determines the number of separated graphs present in the input.

#### <ins>Usage :

- Run the program in the terminal.
- Enter the number of connections followed by pairs of positive integers representing the connections between vertices.

#### <ins>Features :

- Creates a graph representation based on the input connections.
- Counts the number of separated graphs in the input.

#### <ins>Methods :

```sh
getCountOfGraphs(List<Integer> vertices)
```
Calculates and returns the number of separated graphs in the input.

```sh
tryAddToExistingGraph(Map<Integer, Set<Integer>> graphsMap, int vertex1, int vertex2)
```
Tries to add vertices to an existing graph if there is a connection.
```sh

putNewSetWithDefInit(Map<Integer, Set<Integer>> graphsMap, int countOfGraphs, int vertex1, int vertex2)
```
Creates a new set with vertices and initializes a new graph.

#### <ins> Example :

- Input :

      3
      
      4 3
      
      1 4
      
      5 6

- Output :

      2
