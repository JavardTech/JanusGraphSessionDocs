graph = TinkerGraph.open();
graph.io(graphml()).readGraph('/home/sanil/softBase/class/tinkerpop-modern.xml');
g = graph.traversal();

println()
println(':::::::::::::::::::::::::::::::::::::::::::::::::::output:::::::::::::::::::::::::::::::::::::::::::::::::::');
println()
println("Data ingestion successfull");
println("Number of vertex ingested :: " + g.V().count().next());
println("Number of Edges ingested ::" + g.E().count().next());
println()
println(':::::::::::::::::::::::::::::::::::::::::::::::::::output:::::::::::::::::::::::::::::::::::::::::::::::::::');