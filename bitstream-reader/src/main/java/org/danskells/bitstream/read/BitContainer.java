package org.danskells.bitstream.read;

public interface BitContainer {

  StreamNode getStreamNode(long startInclusive, long endExclusive);

}

