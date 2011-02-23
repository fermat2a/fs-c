package de.pc2.dedup.chunker

/*
 * Represents a  part of a large file
 * @filename filename (or hash of a filename in privacy mode)
 * @chunks list of chunks that form the file contents
 */
case class FilePart(filename: String, chunks: List[Chunk]) {
}
