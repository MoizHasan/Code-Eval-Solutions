#!/usr/bin/env ruby -wKU
class StringPermutations 
#challenge for codeeval.com
#Write a program which prints all the permutations of a string in alphabetical order. 

The sorting should be performed in ascending order. 
  def initialize(str)
    @str = str
  end
  
def permutations
    list = ""
    @str.split("").permutation.to_a.sort.each do |x| list += x.join + ","
    end
    list[0..-2]
end


  File.open(ARGV[0]).each_line do |line|
    sp = StringPermutations.new(line.strip)
    puts sp.permutations
  end
end