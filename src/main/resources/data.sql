INSERT INTO `user` (`username`, `password`, `salt`, `role`, `emailaddress`, `firstname`, `prefix`,`lastname`, `address`, `houseNumber`, `postalcode`, `city`, `country`,`dateOfBirth`, `bsn`) VALUES ('Harold', 'dlorah','123', 'client', 'info@hjstevens.nl', 'Harold', '', 'Stevens', 'Pieter Woutersstraat', '26', '2215MC', 'Voorhout', '', '1973-09-25', '123456007');
INSERT INTO `user` (`username`, `password`, `salt`, `role`, `emailaddress`, `firstname`,`prefix`, `lastname`, `address`, `houseNumber`, `postalcode`, `city`, `country`,`dateOfBirth`, `bsn`) VALUES ('Alex', '95b16f1451df0e2721422acaaac90435b163b7b94e882f85e451d8be4644cff12ba98a019ad7498239e55681f40e79c0d1a052566f63c282c4fa16ce4e129158', '234' ,'client', 'alex@hva.nl', 'Alex', '', 'Shijan', 'Koningstraat', '10', '1010DS', 'Amsterdam', '', '1990-08-25', '123465992');
INSERT INTO `user` (`username`, `password`, `salt`, `role`, `emailaddress`, `firstname`, `prefix`,`lastname`, `address`, `houseNumber`, `postalcode`, `city`, `country`, `dateOfBirth`, `bsn`) VALUES ('Hannah', 'hannah', '345','client', 'hannah@hva.nl', 'Hannah', 'van', 'Dam', 'Prinsessenstraat', '29', '1300PT', 'Rotterdam', '', '1999-01-07', '123477759');

INSERT INTO `account` (`IBAN`, `balance`, `UserID`) VALUES ('NL22RABO9999999991', '10000', '1');
INSERT INTO `account` (`IBAN`, `balance`, `UserID`) VALUES ('NL33ABNA9999999992', '5000', '2');
INSERT INTO `account` (`IBAN`, `balance`, `UserID`) VALUES ('NL44INGB9999999993', '50000', '3');

INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Bitcoin', '10', '1');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Ethereum', '2', '1');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Cardano', '4', '1');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Stellar', '3', '1');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Bitcoin', '3', '2');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Cardano', '7', '2');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Stellar', '2', '2');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Bitcoin', '4', '3');
INSERT INTO `portfolio` (`asset(temp)`, `aantal`, `UserID`) VALUES ('Stellar', '2', '3');

INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (1,'BTC','Bitcoin','Bitcoin is a decentralized cryptocurrency originally described in a 2008 whitepaper by a person, or group of people, using the alias Satoshi Nakamoto. It was launched soon after, in January 2009. Bitcoin is a peer-to-peer online currency, meaning that all transactions happen directly between equal, independent network participants, without the need for any intermediary to permit or facilitate them. Bitcoin was created, according to Nakamoto?s own words, to allow ?online payments to be sent directly from one party to another without going through a financial institution.? Some concepts for a similar type of a decentralized electronic currency precede BTC, but Bitcoin holds the distinction of being the first-ever cryptocurrency to come into actual use.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (2,'LTC','Litecoin','Litecoin (LTC) is a cryptocurrency that was designed to provide fast, secure and low-cost payments by leveraging the unique properties of blockchain technology. The cryptocurrency was created based on the Bitcoin (BTC) protocol, but it differs in terms of the hashing algorithm used, hard cap, block transaction times and a few other factors. Litecoin has a block time of just 2.5 minutes and extremely low transaction fees, making it suitable for micro-transactions and point-of-sale payments. Litecoin was released via an open-source client on GitHub on Oct. 7, 2011, and the Litecoin Network went live five days later on Oct. 13, 2011. Since then, it has exploded in both usage and acceptance among merchants and has counted among the top ten cryptocurrencies by market capitalization for most of its existence. The cryptocurrency was created by Charlie Lee, a former Google employee, who intended Litecoin to be a \"lite version of Bitcoin,\"\" in that it features many of the same properties as Bitcoin?albeit lighter in weight.\"',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (52,'XRP','XRP','To begin with, it?s important to understand the difference between XRP, Ripple and RippleNet. XRP is the currency that runs on a digital payment platform called RippleNet, which is on top of a distributed ledger database called XRP Ledger. While RippleNet is run by a company called Ripple, the XRP Ledger is open-source and is not based on blockchain, but rather the previously mentioned distributed ledger database. The RippleNet payment platform is a real-time gross settlement (RTGS) system that aims to enable instant monetary transactions globally. While XRP is the cryptocurrency native to the XRP Ledger, you can actually use any currency to transact on the platform. While the idea behind the Ripple payment platform was first voiced in 2004 by Ryan Fugger, it wasn?t until Jed McCaleb and Chris Larson took over the project in 2012 that Ripple began to be built (at the time, it was also called OpenCoin).',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (74,'DOGE','Dogecoin','Dogecoin (DOGE) is based on the popular \"doge\"\" Internet meme and features a Shiba Inu on its logo. The open-source digital currency was created by Billy Markus from Portland, Oregon and Jackson Palmer from Sydney, Australia, and was forked from Litecoin in December 2013. Dogecoins creators envisaged it as a fun, light-hearted cryptocurrency that would have greater appeal beyond the core Bitcoin audience, since it was based on a dog meme. Tesla CEO Elon Musk posted several tweets on social media that Dogecoin is his favorite coin.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (825,'USDT','Tether','USDT is a stablecoin (stable-value cryptocurrency) that mirrors the price of the U.S. dollar, issued by a Hong Kong-based company Tether. The token?s peg to the USD is achieved via maintaining a sum of commercial paper, fiduciary deposits, cash, reserve repo notes, and treasury bills in reserves that is equal in USD value to the number of USDT in circulation. Originally launched in July 2014 as Realcoin, a second-layer cryptocurrency token built on top of Bitcoin?s blockchain through the use of the Omni platform, it was later renamed to USTether, and then, finally, to USDT. In addition to Bitcoin?s, USDT was later updated to work on the Ethereum, EOS, Tron, Algorand, and OMG blockchains. The stated purpose of USDT is to combine the unrestricted nature of cryptocurrencies ? which can be sent between users without a trusted third-party intermediary ? with the stable value of the US dollar.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (1027,'ETH','Ethereum','Ethereum is a decentralized open-source blockchain system that features its own cryptocurrency, Ether. ETH works as a platform for numerous other cryptocurrencies, as well as for the execution of decentralized smart contracts. Ethereum was first described in a 2013 whitepaper by Vitalik Buterin. Buterin, along with other co-founders, secured funding for the project in an online public crowd sale in the summer of 2014 and officially launched the blockchain on July 30, 2015. Ethereum?s own purported goal is to become a global platform for decentralized applications, allowing users from all over the world to write and run software that is resistant to censorship, downtime and fraud.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (1831,'BCH','Bitcoin Cash','Bitcoin Cash is a peer-to-peer electronic cash system that aims to become sound global money with fast payments, micro fees, privacy, and high transaction capacity (big blocks). In the same way that physical money, such as a dollar bill, is handed directly to the person being paid, Bitcoin Cash payments are sent directly from one person to another. As a permissionless, decentralized cryptocurrency, Bitcoin Cash requires no trusted third parties and no central bank. Unlike traditional fiat money, Bitcoin Cash does not depend on monetary middlemen such as banks and payment processors. Transactions cannot be censored by governments or other centralized corporations. Similarly, funds cannot be seized or frozen ? because financial third parties have no control over the Bitcoin Cash network.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (1839,'BNB','Binance Coin','Launched in July 2017, Binance is one of the biggest cryptocurrency exchanges globally. By aiming to bring cryptocurrency exchanges to the forefront of financial activity globally. The idea behind Binance?s name is to show this new paradigm in global finance ? Binary Finance, or Binance. Aside from being the largest cryptocurrency exchange globally, Binance has launched a whole ecosystem of functionalities for its users. The Binance network includes the Binance Chain, Academy, Trusted Wallet and Research projects, which all employ the powers of blockchain technology to bring new-age finance to the world. Binance Coin is an integral part of the successful functioning of many of the Binance sub-projects.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (1975,'LINK','Chainlink','Founded in 2017, Chainlink is a blockchain abstraction layer that enables universally connected smart contracts. Through a decentralized oracle network, Chainlink allows blockchains to securely interact with external data feeds, events and payment methods, providing the critical off-chain information needed by complex smart contracts to become the dominant form of digital agreement. The Chainlink Network is driven by a large open-source community of data providers, node operators, smart contract developers, researchers, security auditors and more. The company focuses on ensuring that decentralized participation is guaranteed for all node operators and users looking to contribute to the network.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (2010,'ADA','Cardano','Cardano is a proof-of-stake blockchain platform that says its goal is to allow ?changemakers, innovators and visionaries? to bring about positive global change. The open-source project also aims to ?redistribute power from unaccountable structures to the margins to individuals? ? helping to create a society that is more secure, transparent and fair. Cardano was founded back in 2017, and the ADA token is designed to ensure that owners can participate in the operation of the network. Because of this, those who hold the cryptocurrency have the right to vote on any proposed changes to the software. The team behind the layered blockchain say that there have already been some compelling use cases for its technology, which aims to allow decentralized apps and smart contracts to be developed with modularity. Cardano is used by agricultural companies to track fresh produce from field to fork, while other products built on the platform allow educational credentials to be stored in a tamper-proof way, and retailers to clamp down on counterfeit goods.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (3077,'VET','VeChain','VeChain (VET) is a blockchain-powered supply chain platform. Begun in 2015 and launched in June 2016, VeChain aims to use distributed governance and Internet of Things (IoT) technology to create an ecosystem which solves some of the major problems with supply chain management. The platform uses two in-house tokens, VET and VTHO, to manage and create value based on its VeChainThor public blockchain. The idea is to boost the efficiency, traceability and transparency of supply chains while reducing costs and placing more control in the hands of individual users.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (3408,'USDC','USD Coin','USD Coin (known by its ticker USDC) is a stablecoin that is pegged to the U.S. dollar on a 1:1 basis. Every unit of this cryptocurrency in circulation is backed up by $1 that is held in reserve, in a mix of cash and short-term U.S. Treasury bonds. The Centre consortium, which is behind this asset, says USDC is issued by regulated financial institutions. The stablecoin originally launched on a limited basis in September 2018. Put simply, USD Coin?s mantra is ?digital money for the digital age? ? and the stablecoin is designed for a world where cashless transactions are becoming more common. Several use cases have been unveiled for the USD Coin. As well as providing a safe haven for crypto traders in times of volatility, those behind the stablecoin say it can also allow businesses to accept payments in digital assets, and shake up an array of sectors including decentralized finance and gaming. Overall, the goal is to create an ecosystem where USDC is accepted by as many wallets, exchanges, service providers and dApps as possible.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (3717,'WBTC','Wrapped Bitcoin','Wrapped Bitcoin is a tokenized version of Bitcoin (BTC) that runs on the Ethereum (ETH) blockchain. WBTC is compliant with ERC-20 ? the basic compatibility standard of the Ethereum blockchain ? allowing it to be fully integrated into the latter?s ecosystem of decentralized exchanges, crypto lending services, prediction markets and other ERC-20-enabled decentralized finance (DeFi) applications. WBTC is also backed by Bitcoin at a 1:1 ratio via a network of automatically monitored merchants and custodians, ensuring that its price is pegged to Bitcoin at all times and allows users to transfer liquidity between the BTC and the ETH networks in a decentralized and autonomous manner. Wrapped Bitcoin was first announced on October 26, 2018, and officially launched on January 31, 2019.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (3890,'MATIC','Polygon','Polygon (previously Matic Network) is the first well-structured, easy-to-use platform for Ethereum scaling and infrastructure development. Its core component is Polygon SDK, a modular, flexible framework that supports building multiple types of applications. Using Polygon, one can create optimistic rollup chains, ZK rollup chains, stand alone chains or any other kind of infra required by the developer. Polygon effectively transforms Ethereum into a full-fledged multi-chain system (aka Internet of Blockchains). This multi-chain system is akin to other ones such as Polkadot, Cosmos, Avalanche etc. with the advantages of Ethereum?s security, vibrant ecosystem and openness. The $MATIC token will continue to exist and will play an increasingly important role, securing the system and enabling governance. Polygon (formerly Matic Network) is a Layer 2 scaling solution backed by Binance and Coinbase. The project seeks to stimulate mass adoption of cryptocurrencies by resolving the problems of scalability on many blockchains. Polygon combines the Plasma Framework and the proof-of-stake blockchain architecture. The Plasma framework used by Polygon as proposed by the co-founder of Ethereum, Vitalik Buterin, allows for the easy execution of scalable and autonomous smart contracts. Nothing will change for the existing ecosystem built on the Plasma-POS chain. With Polygon, new features are being built around the existing proven technology to expand the ability to cater to diverse needs from the developer ecosystem. Polygon will continue to develop the core technology so that it can scale to a larger ecosystem. Polygon boasts of up to 65,000 transactions per second on a single side chain, along with a respectable block confirmation time of less than two seconds. The framework also allows for the creation of globally available decentralized financial applications on a single foundational blockchain. The Plasma framework gives Polygon the potential of housing an unlimited number of decentralized applications on their infrastructure without experiencing the normal drawbacks common on proof-of-work blockchains. So far, Polygon has attracted more than 50 DApps to its PoS-secured Ethereum sidechain. MATIC, the native tokens of Polygon, is an ERC-20 token running on the Ethereum blockchain. The tokens are used for payment services on Polygon and as a settlement currency between users who operate within the Polygon ecosystem. The transaction fees on Polygon sidechains are also paid in MATIC tokens.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (4172,'LUNA','Terra','Terra is a blockchain protocol that uses fiat-pegged stablecoins to power price-stable global payments systems. According to its white paper, Terra combines the price stability and wide adoption of fiat currencies with the censorship-resistance of Bitcoin (BTC) and offers fast and affordable settlements. Development on Terra began in January 2018, and its mainnet officially launched in April 2019. As of September 2020, it offers stablecoins pegged to the U.S. dollar, South Korean won, Mongolian tugrik and the International Monetary Funds Special Drawing Rights basket of currencies ? and it intends to roll out additional options. Terras native token, LUNA, is used to stabilize the price of the protocols stablecoins. LUNA holders are also able to submit and vote on governance proposals.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (4687,'BUSD','Binance USD','Binance USD (BUSD) is a 1:1 USD-backed stable coin issued by Binance (in partnership with Paxos), Approved and regulated by the New York State Department of Financial Services (NYDFS), The BUSD Monthly Audit Report can be viewed from the official website. Launched on 5 Sep 2019, BUSD aims to meld the stability of the dollar with blockchain technology. It is a digital fiat currency, issued as ERC-20 and supports BEP-2.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (5426,'SOL','Solana','Solana is a highly functional open source project that banks on blockchain technology?s permissionless nature to provide decentralized finance (DeFi) solutions. While the idea and initial work on the project began in 2017, Solana was officially launched in March 2020 by the Solana Foundation with headquarters in Geneva, Switzerland. The Solana protocol is designed to facilitate decentralized app (DApp) creation. It aims to improve scalability by introducing a proof-of-history (PoH) consensus combined with the underlying proof-of-stake (PoS) consensus of the blockchain. Because of the innovative hybrid consensus model, Solana enjoys interest from small-time traders and institutional traders alike. A significant focus for the Solana Foundation is to make decentralized finance accessible on a larger scale.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (6636,'DOT','Polkadot','Polkadot is an open-source sharding multichain protocol that facilitates the cross-chain transfer of any data or asset types, not just tokens, thereby making a wide range of blockchains interoperable with each other. This interoperability seeks to establish a fully decentralized and private web, controlled by its users, and simplify the creation of new applications, institutions and services. The Polkadot protocol connects public and private chains, permissionless networks, oracles and future technologies, allowing these independent blockchains to trustlessly share information and transactions through the Polkadot relay chain. Polkadot?s native DOT token serves three clear purposes: providing network governance and operations, and creating parachains (parallel chains) by bonding.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (7083,'UNI','Uniswap','Uniswap is a popular decentralized trading protocol, known for its role in facilitating automated trading of decentralized finance (DeFi) tokens. An example of an automated market maker (AMM), Uniswap launched in November 2018, but has gained considerable popularity this year thanks to the DeFi phenomenon and associated surge in token trading. Uniswap aims to keep token trading automated and completely open to anyone who holds tokens, while improving the efficiency of trading versus that on traditional exchanges. Uniswap creates more efficiency by solving liquidity issues with automated solutions, avoiding the problems which plagued the first decentralized exchanges. In September 2020, Uniswap went a step further by creating and awarding its own governance token, UNI, to past users of the protocol. This added both profitability potential and the ability for users to shape its future ? an attractive aspect of decentralized entities.',NULL);
INSERT INTO `Asset` (`assetId`,`symbol`,`name`,`discription`,`exchangeRate`) VALUES (8916,'ICP','Internet Computer','The Internet Computer is the world?s first blockchain that runs at web speed with unbounded capacity. It also represents the third major blockchain innovation, alongside Bitcoin and Ethereum ? a blockchain computer that scales smart contract computation and data, runs them at web speed, processes and stores data efficiently, and provides powerful software frameworks to developers. By making this possible, the Internet Computer enables the complete reimagination of software ? providing a revolutionary new way to build tokenized internet services, pan-industry platforms, decentralized financial systems, and even traditional enterprise systems and websites. The project was founded in October 2016 by Dominic Williams, and attracted notable interest from the crypto community. DFINITY raised a total of $121 million from contributors such as Andreessen Horowitz, Polychain Capital, SV Angel, Aspect Ventures, Electric Capital, ZeroEx, Scalar Capital, and Multicoin Capital, and several notable early Ethereum supporters. In 2018, over 50,000 registerter participants received ICP utility tokens in an airdrop. On December 18, 2020, DFINITY launched the alpha mainnet of the Internet Computer. In a final step towards decentralization, on May 10, 2021, DFINITY launched the Internet Computer into the public domain. This major milestone means that the internet now functions as a decentralized global computer ? marked by the release of all of the Internet Computer?s source code into the public domain, as well as ICP utility token allowing tens of thousands of community members to govern the Internet Computer network.',NULL);

INSERT INTO `transaction` (`UserID`, `transactionDateTime`, `transactionSort`, `amountAssets`, `exchangeRateTransaction`, `transactionFee`, `opposingUserID`, `assetId`) VALUES ('1', '2021-09-02 13:00:00', 'Buy', '2', '20', '1', '3', '52');
INSERT INTO `transaction` (`UserID`, `transactionDateTime`, `transactionSort`, `amountAssets`, `exchangeRateTransaction`, `transactionFee`, `opposingUserID`, `assetId`) VALUES ('2', '2021-09-02 14:00:00', 'Sell', '3', '48000', '1', '3', '1');