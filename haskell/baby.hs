doubleMe x = x + x
doubleUs x y = x * 2 + y * 2
boomBangs xs = [if x < 10 then "Boom!" else "Bang!" | x <- xs, odd x]
people = ["LILY", "LUCY", "ALICE"]
describe = ["Beautiful", "Smart", "Amiable"]