# A Fast and Accurate Vietnamese Word Segmenter

The implementation of RDRsegmenter (**training code**), as described in [our paper](https://www.aclweb.org/anthology/L18-1410):

	@InProceedings{NguyenNVDJ2018,
	author={Dat Quoc Nguyen and Dai Quoc Nguyen and Thanh Vu and Mark Dras and Mark Johnson},
	title={{A Fast and Accurate Vietnamese Word Segmenter}},
	booktitle={Proceedings of the 11th International Conference on Language Resources and Evaluation (LREC 2018)},
	pages={2582--2587},
	year={2018}
	}

**Please CITE** our paper whenever RDRsegmenter is used to produce published results or incorporated into other software. 

RDRsegmenter has also been incorporated into our Java NLP annotation pipeline [VnCoreNLP](https://github.com/vncorenlp/VnCoreNLP) for Vietnamese. VnCoreNLP provides rich linguistic annotations through key NLP components of word segmentation, POS tagging, named entity recognition and dependency parsing.

## Usage

Supposed that Java 1.8+ & Python 2.7 are already set to run in command line or terminal. To train RDRsegmenter using a gold word segmentation corpus:

	// #1: Compile a preprocessor for data conversion:
	RDRsegmenter$ javac -encoding UTF-8 DataPreprocessor.java
	// #2: Convert the gold corpus into BI-based format, and initially segment its corresponding raw text:
	RDRsegmenter$ java DataPreprocessor PATH-TO-GOLD-SEGMENTATION-TRAINING-CORPUS
	#3: Train RDRsegmenter using .BI and .RAW.Init files produced by the preprocessor:
	train$ python RDRsegmenter.py train PATH-TO-GOLD-SEGMENTATION-TRAINING-CORPUS.BI PATH-TO-TRAINING-CORPUS.RAW.Init


#### Examples:

	RDRsegmenter$ java DataPreprocessor train/Train_gold.txt
	RDRsegmenter$ cd train
	train$ python RDRsegmenter.py train Train_gold.txt.BI Train_gold.txt.RAW.Init