runLengthEncoding :: (Eq a) => [a] -> [(a,Int)]
runLengthEncoding (x:xs)
    | xs == []  = [(x,1)]
    | x == a    = (x,b+1):(tail (runLengthEncoding xs))
    | otherwise = (x,1):(runLengthEncoding xs)
    where (a,b) = head (runLengthEncoding xs)