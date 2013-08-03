runLengthEncoding :: (Eq a) => [a] -> [(a,Int)]
runLengthEncoding [] = []
runLengthEncoding [x] = [(x,1)]
runLengthEncoding (x:xs) 
    | x == a    = (x,b+1):(tail (runLengthEncoding xs))
    | otherwise = (x,1):(runLengthEncoding xs)
    where (a,b) = head (runLengthEncoding xs)