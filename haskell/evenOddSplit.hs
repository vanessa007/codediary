evenOddSplit :: [a] -> ([a], [a])
evenOddSplit [] = ([], [])
evenOddSplit (x:xs) = (x:o, e)
  where (e,o) = evenOddSplit xs