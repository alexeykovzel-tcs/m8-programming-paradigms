import Test.QuickCheck
import Data.Char

-- exercise 1

f :: Double -> Double
f x = 2 * x^2 + 3 * x - 5

-- exercise 2

total1 :: Int -> Int
total1 0 = 0
total1 n = total1 (n - 1) + n

total2 :: Int -> Int
total2 n = (n * (n + 1)) `div` 2

prop_total n = (n >= 0) ==> total1 n == total2 n

-- exercise 3

prop_ex3_1 a b = a + b == b + a

prop_ex3_2 a b = a - b == b - a

-- exercise 4

-- original (n = 3)
code :: Char -> Char
code c
    | c >= 'a' && c <= 'z' = to_c shifted 122
    | c >= 'A' && c <= 'Z' = to_c shifted 90
    | otherwise = c
    where
        shifted = ord c + 3
        to_c val limit
            | val > limit = chr (val - 26)
            | otherwise = chr (val)


-- map code "hello" = "khoor"
-- map code "Tomorrow evening, 8 o’clock in Amsterdam"
--        = "Wrpruurz hyhqlqj, 8 r\8217forfn lq Dpvwhugdp"`

-- generalized
code_gen :: Char -> Int -> Char
code_gen c n
    | c >= 'a' && c <= 'z' = to_c shifted 122
    | c >= 'A' && c <= 'Z' = to_c shifted 90
    | otherwise = c
    where
        shifted = ord c + n
        to_c val limit
            | val > limit = chr (val - 26)
            | otherwise = chr (val)


prop_code :: Char -> Bool
prop_code c = code c == code_gen c 3

prop_code_2 :: Char -> Bool
prop_code_2 c = c == code_gen c 26

-- exercise 5

interest :: Double -> Double -> Int -> Double
interest money percent years
    | years > 0 = interest next_money percent (years - 1)
    | otherwise = money
    where next_money = money * (percent + 1)

-- exercise 6

discr :: Double -> Double -> Double -> Double
discr a b c = b^2 - 4 * a * c

root :: Double -> Double -> Double -> Double -> Double
root a b c op
    | d < 0 = error "negative discriminant"
    | otherwise = (-b + op * (sqrt d)) / (2 * a)
    where d = discr a b c

root1 :: Double -> Double -> Double -> Double
root1 a b c = root a b c (-1)

root2 :: Double -> Double -> Double -> Double
root2 a b c = root a b c 1

-- exercise 7

extrX = -1

extrY a b c = c

-- exercise 8

mylength :: [a] -> Int
mylength [] = 0
mylength (x:xs) = mylength xs + 1

prop_length a = mylength a == length a

mysum :: [Int] -> Int
mysum [] = 0
mysum (x:xs) = mysum xs + x

prop_sum a = mysum a == sum a

myreverse :: [a] -> [a]
myreverse [] = []
myreverse (x:xs) = (myreverse xs) ++ [x]

prop_reverse a = myreverse a == reverse a

mytake :: Int -> [a] -> [a]
mytake 0 _ = []
mytake _ [] = []
mytake n (x:xs) = x : mytake (n - 1) xs

prop_take a b = (a > 0) ==> mytake a b == take a b

myelem :: Eq a => a -> [a] -> Bool
myelem _ [] = False
myelem y (x:xs)
    | x == y = True
    | otherwise = myelem y xs

prop_elem a b = myelem a b == elem a b

myconcat :: [[a]] -> [a]
myconcat [] = []
myconcat (x:xs) = x ++ myconcat xs

prop_concat a = myconcat a == concat a

mymaximum :: Ord a => [a] -> a
mymaximum [] = error "empty array"
mymaximum [x] = x
mymaximum (x:xs)
    | x > y = x
    | otherwise = y
    where y = mymaximum xs

prop_maximum a = (length a > 0) ==> mymaximum a == maximum a

myzip :: [a] -> [a] -> [(a, a)]
myzip [] _ = []
myzip _ [] = []
myzip (x:xs) (y:ys) = (x, y) : myzip xs ys

prop_zip a b = myzip a b == zip a b

-- exercise 9

gen_seq :: Num a => a -> a -> Int -> [a]
gen_seq from diff depth
    | depth == 0 = []
    | otherwise = from : gen_seq (from + diff) diff (depth - 1)

gen_num :: Num a => a -> a -> Int -> a
gen_num from diff idx
    | idx == 0 = from
    | otherwise = gen_num (from + diff) diff (idx - 1)

totalr :: Int -> Int -> Int
totalr i j
    | i == j = i
    | otherwise = i + totalr (i + 1) j

-- exercise 10

-- all_equal :: [a] -> Bool
-- all_equal [] = True
-- all_equal [a] = True
all_equal xs = foldl (==) True xs

-- is_as :: [a] -> Bool
-- is_as (x:y:xs) = all_equal $ zipWith (\a b -> a * (y - x)) [0..] xs

-- main :: IO ()
-- main = do
--     print (total1 100)
--     print (total2 100)
